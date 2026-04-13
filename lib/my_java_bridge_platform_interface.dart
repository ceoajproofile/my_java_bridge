import 'package:plugin_platform_interface/plugin_platform_interface.dart';

import 'my_java_bridge_method_channel.dart';

abstract class MyJavaBridgePlatform extends PlatformInterface {
  /// Constructs a MyJavaBridgePlatform.
  MyJavaBridgePlatform() : super(token: _token);

  static final Object _token = Object();

  static MyJavaBridgePlatform _instance = MethodChannelMyJavaBridge();

  /// The default instance of [MyJavaBridgePlatform] to use.
  ///
  /// Defaults to [MethodChannelMyJavaBridge].
  static MyJavaBridgePlatform get instance => _instance;

  /// Platform-specific implementations should set this with their own
  /// platform-specific class that extends [MyJavaBridgePlatform] when
  /// they register themselves.
  static set instance(MyJavaBridgePlatform instance) {
    PlatformInterface.verifyToken(instance, _token);
    _instance = instance;
  }

  Future<String?> getPlatformVersion() {
    throw UnimplementedError('platformVersion() has not been implemented.');
  }
}
