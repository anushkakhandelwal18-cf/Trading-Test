package com.cloudframe.app.common;

import com.cloudframe.app.business.*;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.repository.*;
import com.cloudframe.app.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CommonProcess extends BaseProcess {
  @Autowired
  @Qualifier("db2Base")
  protected Db2Base db2Base;

  @Autowired
  @Qualifier("trdpbexc")
  protected Trdpbexc trdpbexc;
}
