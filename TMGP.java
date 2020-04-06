package com.cxy.mydemo;

/*
Created by a_bin on 2020-03-31

email: ybjaychou@gmail.com
*/
public class TMGP {

    private static final float[][][] COORDS = {
            {//2个小技能3个大技能
                    {1347, 950},//KEY_L1 大技1
                    {1464, 745},//KEY_L2 大技2
                    {1665, 627},//KEY_R1 大技3
                    {1656, 416},//KEY_R2 装备技能
                    {1030, 970},//KEY_Y  小技1
                    {1178, 970},//KEY_X  小技2
                    {0, 0},//KEY_B
                    {1670, 922},//KEY_A  普通攻击A
                    {202, 428},//KEY_SELECT  买装备1
                    {202, 546},//KEY_START   买装备2
                    {1245, 840},//KEY_DPAD_LEFT  大技1加点
                    {1360, 640},//KEY_DPAD_RIGHT 大技2加点
                    {1562, 522},//KEY_DPAD_UP    大技3加点
                    {0, 0},//KEY_DPAD_DOWN
                    {330, 845},//KEY_JOYSTICK_L  左摇杆中心点
                    {0, 0},//KEY_JOYSTICK_R
                    {0, 0},//KEY_THUMB_L
                    {0, 0}//KEY_THUMB_R
            },
            {//3个小技能3个大技能
                    {1444, 950},//KEY_L1 大技1
                    {1557, 750},//KEY_L2 大技2
                    {1758, 627},//KEY_R1 大技3
                    {1750, 416},//KEY_R2 装备技能
                    {980, 970},//KEY_Y   小技1
                    {1124, 970},//KEY_X  小技2
                    {1273, 970},//KEY_B  小技3
                    {1763, 922},//KEY_A  普通攻击A
                    {202, 428},//KEY_SELECT  买装备1
                    {202, 546},//KEY_START   买装备2
                    {1341, 840},//KEY_DPAD_LEFT  大技1加点
                    {1458, 640},//KEY_DPAD_RIGHT 大技2加点
                    {1655, 522},//KEY_DPAD_UP    大技3加点
                    {0, 0},//KEY_DPAD_DOWN
                    {291, 845},//KEY_JOYSTICK_L  左摇杆中心点
                    {0, 0},//KEY_JOYSTICK_R
                    {0, 0},//KEY_THUMB_L
                    {0, 0}//KEY_THUMB_R
            },
            {//2个小技能4个大技能
                    {1352, 950},//KEY_L1 大技1
                    {1387, 781},//KEY_L2 大技2
                    {1527, 658},//KEY_R1 大技3
                    {1704, 633},//KEY_R2 大技4
                    {1030, 970},//KEY_Y   小技1
                    {1180, 970},//KEY_X  小技2
                    {1655, 418},//KEY_B  装备技能
                    {1670, 922},//KEY_A  普通攻击A
                    {202, 428},//KEY_SELECT  买装备1
                    {202, 546},//KEY_START   买装备2
                    {1264, 856},//KEY_DPAD_LEFT  大技1加点
                    {1304, 692},//KEY_DPAD_RIGHT 大技2加点
                    {1441, 567},//KEY_DPAD_UP    大技3加点
                    {1617, 538},//KEY_DPAD_DOWN  大技4加点
                    {330, 845},//KEY_JOYSTICK_L  左摇杆中心点
                    {0, 0},//KEY_JOYSTICK_R
                    {0, 0},//KEY_THUMB_L
                    {0, 0}//KEY_THUMB_R
            },
            {//3个小技能4个大技能
                    {1446, 945},//KEY_L1 大技1
                    {1488, 781},//KEY_L2 大技2
                    {1622, 658},//KEY_R1 大技3
                    {1800, 633},//KEY_R2 大技4
                    {980, 970},//KEY_Y   小技1
                    {1124, 970},//KEY_X  小技2
                    {1273, 970},//KEY_B  小技3
                    {1767, 922},//KEY_A  普通攻击A
                    {202, 428},//KEY_SELECT  买装备1
                    {202, 546},//KEY_START   买装备2
                    {1360, 856},//KEY_DPAD_LEFT  大技1加点
                    {1397, 699},//KEY_DPAD_RIGHT 大技2加点
                    {1540, 567},//KEY_DPAD_UP    大技3加点
                    {1715, 538},//KEY_DPAD_DOWN  大技4加点
                    {330, 845},//KEY_JOYSTICK_L  左摇杆中心点
                    {0, 0},//KEY_JOYSTICK_R
                    {1750, 414},//KEY_THUMB_L    装备技能
                    {0, 0}//KEY_THUMB_R
            }
    };

    private int mGameCoordsType;


    public void changeCoordsType() {
        mGameCoordsType++;
        if (mGameCoordsType >= COORDS.length) {
            mGameCoordsType = 0;
        }
    }


    public float[][] getGameCoords() {
        return COORDS[mGameCoordsType];
    }

    /*@Override
    public float[][] getGameCoords() {
        return COORDS[mGameCoordsType];
    }*/
}
