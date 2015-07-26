package controllers

import play.api.mvc.{Action, Controller}

/**
 * Created by haritz on 26/07/15.
 */
object About extends Controller{
  def about = Action {
    Ok("About")
  }
}
