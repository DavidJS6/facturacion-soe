package bo.edu.uagrm.soe.facturacionsoe.database.services.implementations;

import bo.edu.uagrm.soe.facturacionsoe.database.models.Data;
import bo.edu.uagrm.soe.facturacionsoe.database.repositories.DataRepository;
import bo.edu.uagrm.soe.facturacionsoe.database.services.DataService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("DataService")
public class DataServiceImpl implements DataService {

    private final DataRepository dataRepository;

    public DataServiceImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public Collection<Data> getAllData() {
        return dataRepository.getAllBy();
    }

}
