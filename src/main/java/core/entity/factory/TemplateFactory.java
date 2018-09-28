package core.entity.factory;

import core.templating.TemplateEngine;
import core.templating.TemplateParserDefault;
import core.templating.TemplateParserTwig;

public class TemplateFactory {

    public TemplateEngine create(String type) {
        try {
            switch (TemplateEngine.Type.valueOf(type)) {
                case DEFAULT:
                    return new TemplateParserDefault();
                case TWIG:
                    return new TemplateParserTwig();
                default:
                    throw new Exception("TemplateFactory: Specified templating engine is not available");
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
