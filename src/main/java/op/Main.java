package op;

//import io.grpc.netty.shaded.io.netty.channel.AbstractChannel;
//import io.grpc.netty.shaded.io.netty.channel.socket.nio.NioDatagramChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import io.netty.channel.AbstractChannel;
//import io.netty.channel.socket.nio.NioDatagramChannel;
//import io.grpc.netty.shaded.io.netty.util.ReferenceCountUtil;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

final class Main {
  private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    LOGGER.info("Hello World!");
  // AbstractChannel ac = new NioDatagramChannel();
  // boolean registered = ac.isRegistered();
    StorageOptions options = StorageOptions.getDefaultInstance();
    Storage storage = options.getService();

    LOGGER.info("storage = {}", storage);

    // boolean isReferenceCount = ReferenceCountUtil.release("message");

  }

}
