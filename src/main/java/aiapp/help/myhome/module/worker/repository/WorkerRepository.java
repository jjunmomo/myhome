package aiapp.help.myhome.module.worker.repository;

import aiapp.help.myhome.module.worker.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
