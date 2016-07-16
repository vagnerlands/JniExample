
#ifdef HELLO_JNI_H
#define HELLO_JNI_H

#include <GLES2/gl2.h>
#include <GLES2/gl2ext.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>




// set up the drawing area according to the width and height received
extern bool setupGraphics(int w, int h);
// render a frame in the openGL Surface
extern void renderFrame();
// update all touch parameters to interact with the image
extern void updateTouchParameters(float previousX, float previousY, float deltaX, float deltaY);
// prints debug information in the LOGCAT
extern void printGLString(const char *name, GLenum s);
// checks if there open gl errors - also if shaders were built successfully
extern void checkGlError(const char* op);
// for opengl shaders
extern GLuint createProgram(const char* pVertexSource, const char* pFragmentSource);

//
#endif