#pragma once

/// DIMENSION CONSTANTS ---------------------------
const float TRAIN_HEIGHT = 5.0;
const float CAMERA_HEIGHT = 120.0;
const float BOARD_WIDTH = 219.5;
const float BOARD_HEIGHT = 140.5;
/// -----------------------------------------------


/// COLOR CONSTANTS -------------------------------
const int HUE_DEVIATION = 40;

const int RED1 = 360; // 0
const int RED1_LOW = RED1 - HUE_DEVIATION;
const int RED1_HIGH = RED1 + HUE_DEVIATION;

const int RED2 = 0; // 0
const int RED2_LOW = RED2 - HUE_DEVIATION;
const int RED2_HIGH = RED2 + HUE_DEVIATION;

const int GREEN = 154; // 0
const int GREEN_LOW = GREEN - HUE_DEVIATION;
const int GREEN_HIGH = GREEN + HUE_DEVIATION;

const int BLUE = 300; // 0
const int BLUE_LOW = BLUE - HUE_DEVIATION;
const int BLUE_HIGH = BLUE + HUE_DEVIATION;

const int GB_DECISION = 100;
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