cmake_minimum_required(VERSION 3.22.1)

set(CMAKE_CXX_STANDARD 17)

project("placeHolder")
set(LIB_NAME imageApplication)

add_library(libOpenCV SHARED IMPORTED)
set_target_properties(libOpenCV PROPERTIES IMPORTED_LOCATION "${PROJECT_SOURCE_DIR}/libs/libopencv_java4.so")

add_library(${LIB_NAME}
        SHARED
        nativelib.cpp)

target_include_directories(${LIB_NAME}
        PUBLIC
        "opencv2"
)


target_link_libraries(${LIB_NAME}
        libOpenCV
        android
        log)

set_target_properties(${LIB_NAME}
        PROPERTIES
        LIBRARY_OUTPUT_DIRECTORY "${PROJECT_SOURCE_DIR}/libs")
