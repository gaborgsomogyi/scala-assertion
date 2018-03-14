package com.scala

import org.apache.log4j.LogManager

object Assertion {

  @transient lazy val log = LogManager.getLogger(getClass)

  def main(args: Array[String]): Unit = {
    log.info("Firing assertion...")
    var fired = false
    try {
      assert(false, "Intended assertion")
    } catch {
      case e: AssertionError =>
        log.info("Assertion fired")
        fired = true
    }
    if (!fired) {
      log.info("Assertion NOT fired")
    }
  }
}
