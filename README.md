# Spring Kafka Template

#### Start ZooKeeper and Kafka broker service
Go to kafka directory
```bash
cd /Users/user/soft/kafka
```

Run the following commands in order to start all services in the correct order:
```bash
./bin/zookeeper-server-start.sh config/zookeeper.properties
```

Open another terminal session and run:
```bash
./bin/kafka-server-start.sh config/server.properties
```
#### Create topics in Kafka
```bash
./bin/kafka-topics.sh --create --topic out-events --bootstrap-server localhost:9092 --partitions 10
```
```bash
./bin/kafka-topics.sh --create --topic in-events --bootstrap-server localhost:9092 --partitions 10
```