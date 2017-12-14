package com.nk.model.domain;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by JianHuangsh on 2017/12/14.
 */
@Getter
@Setter
public class Response implements Serializable {

  private int code;
  private String result;
  private Object data;

  public static final String SUCCESS_RESULT = "success";
  public static final String ERROR_RESULT = "error";
  private static final int SUCCESS_CODE = 200;
  private static final int ERROR_CODE = 400;

  public static final Response SUCCESS = new Response(SUCCESS_RESULT);

  public Response(String result) {
    this.code = SUCCESS_CODE;
    this.result = result;
  }


}
