package com.example.app;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

@Component
public class SimpleView extends AbstractView {

    @Override
    protected void renderMergedOutputModel(Map<String, Object> model,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        response.getWriter().append("success").flush();
    }

}
