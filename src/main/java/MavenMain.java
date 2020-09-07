import java.io.IOException;

public class MavenMain {
    public static void main(String[] args) throws IOException {
        String topicName = args[1];
        String brokers = args[2];

        switch(args[0].toLowerCase()){
            case "produce":
                Producer.produce(brokers, topicName);
                break;
            case "consume":
                Consumer.consume(brokers, topicName);
                break;
            default:
                System.out.println("Invalid Input arguments");
                System.exit(1);
        }
        System.exit(0);
    }
}
