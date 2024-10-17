package com.example.demo.kafka;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

public class ProducerWithSyncCallback {

	public static final String BOOTSTRAP_SERVERS = "my-kafka:9092";
	public static final String TOPIC_NAME = "test";

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Properties configs = new Properties();
		configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
		configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		// configs.put(ProducerConfig.ACKS_CONFIG, "0");

		KafkaProducer<String, String> producer = new KafkaProducer<>(configs);

		ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC_NAME, "testMassage");

		RecordMetadata metadata = producer.send(record).get();

		System.out.println(metadata.toString());

		producer.flush();
		producer.close();
	}
}
