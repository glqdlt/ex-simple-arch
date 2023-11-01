package ${package}.site;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class SomeController {
#[[
    @Value("${test.key.value}")
    private String key;
]]#
}