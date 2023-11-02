package com.IPCheck

import com.IPCheck.controller.CommandController;

fun main(args: Array<String>) {
    val controller = CommandController();

    controller.start(args);
}
