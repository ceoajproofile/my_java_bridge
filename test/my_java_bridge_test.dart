import 'package:flutter_test/flutter_test.dart';
import 'package:my_java_bridge/my_java_bridge.dart';
import 'package:my_java_bridge/my_java_bridge_platform_interface.dart';
import 'package:my_java_bridge/my_java_bridge_method_channel.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

class MockMyJavaBridgePlatform
    with MockPlatformInterfaceMixin
    implements MyJavaBridgePlatform {

  @override
  Future<String?> getPlatformVersion() => Future.value('42');
}

void main() {
  final MyJavaBridgePlatform initialPlatform = MyJavaBridgePlatform.instance;

  test('$MethodChannelMyJavaBridge is the default instance', () {
    expect(initialPlatform, isInstanceOf<MethodChannelMyJavaBridge>());
  });

  test('getPlatformVersion', () async {
    MyJavaBridge myJavaBridgePlugin = MyJavaBridge();
    MockMyJavaBridgePlatform fakePlatform = MockMyJavaBridgePlatform();
    MyJavaBridgePlatform.instance = fakePlatform;

    expect(await myJavaBridgePlugin.getPlatformVersion(), '42');
  });
}
