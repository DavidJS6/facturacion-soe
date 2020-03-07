package bo.edu.uagrm.soe.facturacionsoe.adapters.dto.parsing;

import java.util.List;

public interface RequestDtoToEntityParser<TRequestDto, TCommand> {
    TCommand parseRequestDtoToCommand(TRequestDto dto);

    List<TCommand> parseRequestDtosToEntities(List<TRequestDto> dtos);
}
