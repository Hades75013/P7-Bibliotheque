package com.ocr.library.service.utilisateurbean;

import com.ocr.library.beans.UtilisateurBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUtilisateurBeanService {

    UtilisateurBean findById(@PathVariable("id") int id);


}
