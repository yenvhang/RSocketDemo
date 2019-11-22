package top.nvhang.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;

import java.util.function.Consumer;

/**
 * @fileName:
 * @author: yuhang.ye
 * @date:
 */
@Controller
public class JobController {
    @MessageMapping("job")
    public Mono<JobResult> processJob(JobRequest request) throws InterruptedException {

        return Mono.create(new Consumer<MonoSink<JobResult>>() {
            @Override
            public void accept(MonoSink<JobResult> jobResultMonoSink) {
                   
            }
        });
    }
}
