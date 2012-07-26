#import "com_marakana_android_lognative_LogLib.h"

JNIEXPORT void JNICALL Java_com_marakana_android_lognative_LogLib_log
(JNIEnv *env, jclass clazz, jint priority, jstring tag, jstring message) {
	const char *c_tag = (*env)->GetStringUTFChars(env, tag, 0);
	const char *c_message = (*env)->GetStringUTFChars(env, message, 0);
	__android_log_write( priority, c_tag, c_message);
	(*env)->ReleaseStringUTFChars(env, tag, c_tag);
	(*env)->ReleaseStringUTFChars(env, message, c_message);
}
