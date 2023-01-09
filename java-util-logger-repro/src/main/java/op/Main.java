package op;

import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.util.logging.Logger;
import java.time.Instant;

final class Main {

  private static final Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    logger.info("Hello World");
    logger.info("Current time: " + Instant.now());

    StorageOptions options = StorageOptions.getDefaultInstance();
    Storage storage = options.getService();

    logger.info("storage = " + storage);
  }

}
