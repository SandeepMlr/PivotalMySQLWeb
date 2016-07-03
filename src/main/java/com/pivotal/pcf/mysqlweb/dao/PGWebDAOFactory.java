package com.pivotal.pcf.mysqlweb.dao;

import com.pivotal.pcf.mysqlweb.dao.tables.TableDAO;
import com.pivotal.pcf.mysqlweb.dao.tables.TableDAOImpl;
import com.pivotal.pcf.mysqlweb.dao.views.ViewDAO;
import com.pivotal.pcf.mysqlweb.dao.views.ViewDAOImpl;

public class PGWebDAOFactory
{
    public static TableDAO getTableDAO()
    {
        return new TableDAOImpl();
    }

    public static ViewDAO getViewDAO()
    {
        return new ViewDAOImpl();
    }
}
