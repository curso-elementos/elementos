/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos2017;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author campitos
 */
@SpringUI
@Theme("valo")
public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
        
        //Layuout principal
        VerticalLayout layout=new VerticalLayout();
        
        //Componentes:
        Label label=new Label();
        label.setValue("MI primer etiqueta en Vaadin");
        
        Button boton1=new Button("Oprimeme");
        boton1.setStyleName(ValoTheme.BUTTON_DANGER);
        
        //Agregamos un evento de botón
        boton1.addClickListener(hola->{
            Notification.show("Hola mundo soy Juan Carlos campos!!", Notification.Type.ERROR_MESSAGE);
        });
        
        //Agregamos componentes al layout principal
        layout.addComponent(label);
        layout.addComponent(boton1);
        
        setContent(layout);
        
    }
    
}
