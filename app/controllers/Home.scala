package controllers

import play.api.mvc.{Action, Controller}

/**
 * Created by haritz on 26/07/15.
 */
class Home extends Controller{

  def welcome = Action {
    Ok(views.html.home())
  }
}
