
/*
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.androidcontroller.events;

import java.awt.event.KeyEvent;

public class KeyConverter {

    public static int getKeyCode(KeyEvent e) {

        char c = e.getKeyChar();
        int code = 0;

        if (Character.isLetter(c)) {
            code = KeyMap.KEYCODE_A + (Character.toLowerCase(c) - 'a');
        }
        if (Character.isDigit(c)) {
            code = KeyMap.KEYCODE_0 + (c - '0');
        }

        if (c == '\n') {
            code = KeyMap.KEYCODE_ENTER;
        }

        if (c == ' ') {
            code = KeyMap.KEYCODE_SPACE;
        }

        if (c == '\b') {
            code = KeyMap.KEYCODE_DEL;
        }

        if (c == '\t') {
            code = KeyMap.KEYCODE_TAB;
        }

        if (c == '/') {
            code = KeyMap.KEYCODE_SLASH;
        }

        if (c == '\\') {
            code = KeyMap.KEYCODE_BACKSLASH;
        }

        if (c == ',') {
            code = KeyMap.KEYCODE_COMMA;
        }

        if (c == ';') {
            code = KeyMap.KEYCODE_SEMICOLON;
        }

        if (c == '.') {
            code = KeyMap.KEYCODE_PERIOD;
        }

        if (c == '*') {
            code = KeyMap.KEYCODE_STAR;
        }

        if (c == '+') {
            code = KeyMap.KEYCODE_PLUS;
        }

        if (c == '-') {
            code = KeyMap.KEYCODE_MINUS;
        }

        if (c == '=') {
            code = KeyMap.KEYCODE_EQUALS;
        }

        if (e.getKeyCode() == KeyEvent.VK_HOME) {
            code = KeyMap.KEYCODE_HOME;
        }

        if (e.getKeyCode() == KeyEvent.VK_PAGE_UP) {
            code = KeyMap.KEYCODE_MENU;
        }

        if (e.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
            code = KeyMap.KEYCODE_STAR;
        }

        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            code = KeyMap.KEYCODE_BACK;
        }

        if (e.getKeyCode() == KeyEvent.VK_F3) {
            code = KeyMap.KEYCODE_CALL;
        }

        if (e.getKeyCode() == KeyEvent.VK_F4) {
            code = KeyMap.KEYCODE_ENDCALL;
        }

        if (e.getKeyCode() == KeyEvent.VK_F5) {
            code = KeyMap.KEYCODE_SEARCH;
        }

        if (e.getKeyCode() == KeyEvent.VK_F7) {
            code = KeyMap.KEYCODE_POWER;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            code = KeyMap.KEYCODE_DPAD_RIGHT;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            code = KeyMap.KEYCODE_DPAD_LEFT;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            code = KeyMap.KEYCODE_DPAD_UP;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            code = KeyMap.KEYCODE_DPAD_DOWN;
        }

        if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
            code = KeyMap.KEYCODE_SHIFT_LEFT;
        }

        return code;
    }

    public static String getKeyCodeString(KeyEvent e) {

        int keyCode = e.getKeyCode();
        String code = null;

        switch (keyCode) {

            case 8: /* Del key */

                code = "del"; //$NON-NLS-1$
                break;
            case KeyEvent.VK_HOME:
                code = "home"; //$NON-NLS-1$
                break;
            case KeyEvent.VK_PAGE_UP:
                code = "menu";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_PAGE_DOWN:
                break;
            case KeyEvent.VK_ESCAPE:
                code = "back";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_SPACE:
                code = "space";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_F3:
                code = "call";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_F4:
                code = "endcall";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_F5:
                code = "search";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_F7:
                code = "power";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_RIGHT:
                code = "dpad_right";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_LEFT:
                code = "dpad_left"; //$NON-NLS-1$
                break;
            case KeyEvent.VK_UP:
                code = "dpad_up";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_DOWN:
                code = "dpad_down";  //$NON-NLS-1$
                break;
            case KeyEvent.VK_SHIFT:
                break;
        }

        return code;
    }

}
