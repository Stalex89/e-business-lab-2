
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/aleks/mytestproject/conf/routes
// @DATE:Thu Mar 01 14:57:55 CET 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
