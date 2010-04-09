/*
 * Copyright (c) 2004-2005 SLF4J.ORG
 * Copyright (c) 2004-2005 QOS.ch
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute, and/or sell copies of  the Software, and to permit persons
 * to whom  the Software is furnished  to do so, provided  that the above
 * copyright notice(s) and this permission notice appear in all copies of
 * the  Software and  that both  the above  copyright notice(s)  and this
 * permission notice appear in supporting documentation.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR  A PARTICULAR PURPOSE AND NONINFRINGEMENT
 * OF  THIRD PARTY  RIGHTS. IN  NO EVENT  SHALL THE  COPYRIGHT  HOLDER OR
 * HOLDERS  INCLUDED IN  THIS  NOTICE BE  LIABLE  FOR ANY  CLAIM, OR  ANY
 * SPECIAL INDIRECT  OR CONSEQUENTIAL DAMAGES, OR  ANY DAMAGES WHATSOEVER
 * RESULTING FROM LOSS  OF USE, DATA OR PROFITS, WHETHER  IN AN ACTION OF
 * CONTRACT, NEGLIGENCE  OR OTHER TORTIOUS  ACTION, ARISING OUT OF  OR IN
 * CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 *
 * Except as  contained in  this notice, the  name of a  copyright holder
 * shall not be used in advertising or otherwise to promote the sale, use
 * or other dealings in this Software without prior written authorization
 * of the copyright holder.
 *
 */

package org.slf4j.impl;

/**
 * An extension of SimpleLogger that goes right down to the TRACE level.
 *
 * @author <a href="mailto:antony.stubbs@gmail.com">Antony Stubbs</a>
 */
public class SimpleTraceLogger extends SimpleLogger {

  private static final long serialVersionUID = -951013710241524276L;

  private static String TRACE_STR = "TRACE";
  private static String DEBUG_STR = "DEBUG";

  SimpleTraceLogger(String name) {
    super(name);
  }

  public boolean isTraceEnabled() {
    return true;
  }

  public void trace(String msg) {
    log(TRACE_STR, msg, null);
  }

  public void trace(String format, Object param1) {
    formatAndLog(TRACE_STR, format, param1, null);
  }

  public void trace(String format, Object param1, Object param2) {
    formatAndLog(TRACE_STR, format, param1, param2);
  }

  public void trace(String format, Object[] argArray) {
    formatAndLog(TRACE_STR, format, argArray);
  }

  public void trace(String msg, Throwable t) {
    log(TRACE_STR, msg, null);
  }

  public boolean isDebugEnabled() {
    return true;
  }

  public void debug(String msg) {
    log(DEBUG_STR, msg, null);
  }

  public void debug(String format, Object param1) {
    formatAndLog(DEBUG_STR, format, param1, null);
  }

  public void debug(String format, Object param1, Object param2) {
    formatAndLog(DEBUG_STR, format, param1, param2);
  }

  public void debug(String format, Object[] argArray) {
    formatAndLog(DEBUG_STR, format, argArray);
  }

  public void debug(String msg, Throwable t) {
    log(DEBUG_STR, msg, null);
  }

}
