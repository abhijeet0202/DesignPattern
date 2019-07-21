/**
 * 
 */
package Kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

/**
 * @author Abhijeet
 *
 */
public class MyProducerKafka {

	public static void main(String[] args) {

		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9093");
		/* acks: This controls the criteria under which requests are considered complete.
		 *		•	0 If set to zero then the producer will not wait for any acknowledgment from the server at all. The record will be immediately added to the 
		 *          socket buffer and considered sent. No guarantee can be made that the server has received the record in this case, and the retries configuration
		 *          will not take effect (as the client won't generally know of any failures). The offset given back for each record will always be set to -1. 
		 *      •   1 This will mean the leader will write the record to its local log but will respond without awaiting full acknowledgement from all followers.
		 *          In this case should the leader fail immediately after acknowledging the record but before the followers have replicated it then the record will be lost.
		 *      •	all: This means the leader will wait for the full set of in-sync replicas to acknowledge the record. This guarantees that the record will not be 
		 *          lost as long as at least one in-sync replica remains alive. This is the strongest available guarantee. This is equivalent to the acks=-1 setting.
		 */
		props.put("acks", "all");
		props.put("delivery.timeout.ms", 30000);
		/* batch.size: Producer Client sent the messages in a batch, Batch.size represnt the size of a single batch, so when messages are keep coming to
		 *  produce/stream toward Kafka. Based on config size producerClient creates buffer/messages of given size and steream to wards kafka in a batch.
		 * The producer maintains buffers of unsent records for each partition. These buffers are of a size specified by the batch.size config. 
		 * Making this larger can result in more batching, but requires more memory
		 */
		props.put("batch.size", 16384);
		/* linger.ms: By default in a buffer(batch.size) is available to send immediately even if there is additional unused space in the buffer.
		 * However if you want to reduce the number of requests you can set linger.ms to something greater than 0. This will instruct the producer
		 * to wait up to that number of milliseconds before sending a request in hope that more records will arrive to fill up the same batch
		 * However this setting would add X millisecond of latency to our request waiting for more records to arrive if we didn't fill up the buffer.
		 */
		//props.put("linger.ms", 30001);
		/* buffer.memory : The buffer.memory controls the total amount of memory available to the producer for buffering. 
		 * if incoming message load is heavy and transmission to server is slower as compare to incoming, Then buffer.memory given size gets exhausted.
		 * Once exhausted, additional send call will get block till ( max.block.ms:configured) time
		 */
		/* max.block.ms :The threshold for time to block is determined by max.block.ms after which it throws a TimeoutException. 
		 */
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		/* retries: Setting a value greater than zero will cause the client to resend any record whose send fails with a potentially transient error. 
		 *    •	Note that this retry is no different than if the client resent the record upon receiving the error. 
		 *    •	Allowing retries without setting max.in.flight.requests.per.connection to 1 will potentially change the ordering of records because 
		 *      if two batches are sent to a single partition, and the first fails and is retried but the second succeeds, then the records in the second 
		 *      batch may appear firs
		 *      t. 
		 *    •	Note Producer requests will be failed before the number of retries has been exhausted if the timeout configured by delivery.timeout.ms 
		 *      expires first before successful acknowledgement. 
		 *      Users should generally prefer to leave this config unset and instead use delivery.timeout.ms to control retry behavior.
		 *    •	Enabling retries also opens up the possibility of duplicates (see the documentation on message delivery semantics for details).
		 */


		Producer<String, String> producer = new KafkaProducer<>(props);
		producer.send(new ProducerRecord<String, String>("my-replicated-topic", "21786", "21786"));
		/*for (int i = 0; i < 100; i++)
			producer.send(new ProducerRecord<String, String>("my-replicated-topic", Integer.toString(i), Integer.toString(i)));
*/
		producer.close();
	}
}
