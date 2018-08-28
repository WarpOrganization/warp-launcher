package net.warpgame.launcher

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

/**
 * @author Hubertus
 *         Created 29.08.2018
 */

class Main : Application() {

    override fun start(stage: Stage?) {
        val root = FXMLLoader.load<Parent>(javaClass.getResource("launcher.fxml"))

        val scene = Scene(root, 400.0, 400.0)

        stage?.title = "Warp Launcher"
        stage?.scene = scene
        stage?.show()
    }

    companion object {
        @JvmStatic fun main(args: Array<String>){
            launch(Main::class.java)
        }
    }
}