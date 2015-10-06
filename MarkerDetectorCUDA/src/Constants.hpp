#pragma once 

/// DIMENSION CONSTANTS ---------------------------
const float TRAIN_HEIGHT = 5.0;
const float CAMERA_HEIGHT = 120.0;
const float BOARD_WIDTH = 219.0;
const float BOARD_HEIGHT = 143.0;
/// -----------------------------------------------


/// COLOR CONSTANTS -------------------------------
const int HUE_DEVIATION = 49.99;

const int CYAN = 200;
const int CYAN_LOW = CYAN - HUE_DEVIATION;
const int CYAN_HIGH = CYAN + HUE_DEVIATION;

const int MAGENTA = 300;
const int MAGENTA_LOW = MAGENTA - HUE_DEVIATION;
const int MAGENTA_HIGH = MAGENTA + HUE_DEVIATION;

const int RED = 0; // 0
const int RED_LOW = RED - HUE_DEVIATION;
const int RED_HIGH = RED + HUE_DEVIATION;

const int GREEN = 120;
const int GREEN_LOW = GREEN - HUE_DEVIATION;
const int GREEN_HIGH = GREEN + HUE_DEVIATION;

const int BLUE = 240; // 240
const int BLUE_LOW = BLUE - HUE_DEVIATION;
const int BLUE_HIGH = BLUE + HUE_DEVIATION;
/// -----------------------------------------------


/// TRAIN IDS -------------------------------------
const int MARKER_COUNT = 3;

const int MARKER_R = 0;
const int MARKER_G = 1;
const int MARKER_B = 2;

const int MARKER_UNKNOWN = -1;
/// -----------------------------------------------


/// TRAIN DIRECTION -------------------------------
const int DIR_CW = 0;
const int DIR_CCW = 1;
const int DIR_NONE = -1;
/// ----------------------------------------------