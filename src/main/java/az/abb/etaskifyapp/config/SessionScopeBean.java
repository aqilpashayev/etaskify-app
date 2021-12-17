package az.abb.etaskifyapp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.io.Serializable;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionScopeBean implements Serializable {

    private static final Logger LOG = LoggerFactory.getLogger(SessionScopeBean.class);

    private static final long serialVersionUID = 201806091147L;

    public void init(){
        LOG.info("init");
    }

    public void destroy(){
        LOG.info("destroy");
    }

    public void iteraction(){
        LOG.info("iteraction");
    }

}
