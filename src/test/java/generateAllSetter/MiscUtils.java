package generateAllSetter;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class MiscUtils {
  public static String readFileFromResource(String  path) throws IOException {
      InputStream inputStream = MiscUtils.class.getClassLoader().getResourceAsStream(path);
      byte[] bytes = new byte[inputStream.available()];
      inputStream.read(bytes);
      inputStream.close();
      String content = new String(bytes, StandardCharsets.UTF_8);
      return content;
  }
}
