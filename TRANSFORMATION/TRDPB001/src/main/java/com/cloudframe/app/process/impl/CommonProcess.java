package com.cloudframe.app.process.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.process.*;
public class CommonProcess extends BaseProcess {
@Autowired 
  @Qualifier("db2Base")
protected Db2Base db2Base;
@Autowired 
  @Qualifier("trdpbexc")
protected Trdpbexc trdpbexc;
}
