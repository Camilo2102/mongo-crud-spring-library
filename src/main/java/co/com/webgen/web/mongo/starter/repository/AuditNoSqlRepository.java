package co.com.webgen.web.mongo.starter.repository;

import co.com.webgen.web.mongo.starter.model.AuditNoSqlModel;
import co.com.webgen.web.starter.repository.AuditRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface AuditNoSqlRepository<T extends AuditNoSqlModel> extends AuditRepository<T> {
}
