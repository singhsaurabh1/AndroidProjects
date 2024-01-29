#include <jni.h>
//#include "opencv2/core.hpp"

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_imageapplication_NativeProcessing_StringFromJNI(JNIEnv *env, jobject thiz) {
    return (jstring) "Hello";
}