import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';

import 'my_java_bridge_platform_interface.dart';

/// An implementation of [MyJavaBridgePlatform] that uses method channels.
class MethodChannelMyJavaBridge extends MyJavaBridgePlatform {
  /// The method channel used to interact with the native platform.
  @visibleForTesting
  final methodChannel = const MethodChannel('my_java_bridge');

  @override
  Future<String?> getPlatformVersion() async {
    final version = await methodChannel.invokeMethod<String>('getPlatformVersion');
    return version;
  }
}
