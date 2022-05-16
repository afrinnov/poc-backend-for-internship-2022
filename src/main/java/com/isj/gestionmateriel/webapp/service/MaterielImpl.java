package com.isj.gestionmateriel.webapp.service;

import com.isj.gestionmateriel.webapp.exception.AfrinnovBusinessException;
import com.isj.gestionmateriel.webapp.model.dto.MaterielDTO;
import com.isj.gestionmateriel.webapp.model.dto.TableauBordDto;
import com.isj.gestionmateriel.webapp.service.mapper.MaterielMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MaterielImpl implements IMateriel {

    @Autowired
    private MaterielMapper materielMapper;

    @Override
    public int ajouterMateriel(MaterielDTO materielDTO) {
        // TODO Appelle de la méthode qui vérifie si la reférence existe dans le DTO
        // TODO Appelle de la méthode qui vérifie si la reférence est déjà utilisé coté BD
        // TODO Sauvegarder le materiel et retourner l'ID

        return 0;
    }

    @Override
    public int supprimerMateriel(String reference) {
        // TODO Appelle de la méthode qui vérifie si la reférence existe dans le DTO
        // TODO Compléter le reste

        return 0;
    }

    @Override
    public int modifierMateriel(MaterielDTO materielDTO) throws AfrinnovBusinessException {
        // TODO Compléter cette méthode

        return 0;
    }

    @Override
    public List<MaterielDTO> listerMateriels() {
        // TODO Compléter cette méthode

        return null;
    }

    @Override
    public MaterielDTO detailMateriel(String reference) {
        // TODO Compléter cette méthode

        return null;
    }

    @Override
    public List<MaterielDTO> rechercherMateriels(String motcle) {
        // TODO Compléter cette méthode

        return null;
    }

    @Override
    public int nbreTotalDeMateriels() {
        // TODO Compléter cette méthode

        return 0;
    }

    @Override
    public TableauBordDto statistiquePourLeTableauBord() {
        // TODO Compléter cette méthode

        return null;
    }

    private boolean checkReferenceAlreadyUsed(String reference) {
        // TODO à compléter
        return false;
    }

    private boolean checkReference(String reference) {
        // TODO à compléter
        return false;
    }
}
