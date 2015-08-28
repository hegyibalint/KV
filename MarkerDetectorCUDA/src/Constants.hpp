#pragma once 

/// DIMENSION CONSTANTS ---------------------------
const float TRAIN_HEIGHT = 5.0;
const float CAMERA_HEIGHT = 120.0;
const float BOARD_WIDTH = 219.0;
const float BOARD_HEIGHT = 143.0;
/// -----------------------------------------------


/// COLOR CONSTANTS -------------------------------
const int CMYK_DEVIATION = 70;

const int CYAN = 210;
const int CYAN_LOW = CYAN - CMYK_DEVIATION;
const int CYAN_HIGH = CYAN + CMYK_DEVIATION;

const int MAGENTA = 326;
const int MAGENTA_LOW = MAGENTA - CMYK_DEVIATION;
const int MAGENTA_HIGH = MAGENTA + CMYK_DEVIATION;

/*
 const int YELLOW = 55;
 const int YELLOW_LOW = YELLOW - CMYK_DEVIATION;
 const int YELLOW_HIGH = YELLOW + CMYK_DEVIATION;
 */
/// -----------------------------------------------


/// TRAIN IDS -------------------------------------
const int MARKER_COUNT = 2;

const int MARKER_C = 0;
const int MARKER_M = 1;
//const int MARKER_Y = 2;
const int MARKER_UNKNOWN = -1;
/// -----------------------------------------------


/// TRAIN DIRECTION -------------------------------
const int CW = 0;
const int CCW = 1;
const int NONE = -1;
/// ----------------------------------------------