package op;

import com.google.common.flogger.GoogleLogger;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.time.Instant;

import java.util.logging.Level;

final class Main {
  private static final GoogleLogger LOGGER = GoogleLogger.forEnclosingClass();

  public static void main(String[] args) {
    LOGGER.at(Level.INFO).log("Hello World");

    // To verify that the logger is being initialized at run-time
    LOGGER.at(Level.INFO).log("CURRENT TIME: " + Instant.now());
    StorageOptions options = StorageOptions.getDefaultInstance();
    Storage storage = options.getService();
    LOGGER.at(Level.INFO).log("storage = {}", storage);


  }

}
