
import 'my_java_bridge_platform_interface.dart';

class MyJavaBridge {
  Future<String?> getPlatformVersion() {
    return MyJavaBridgePlatform.instance.getPlatformVersion();
  }
}
