package react.spring.react_spring_pjt.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import react.spring.react_spring_pjt.bbs.domain.BbsResponseDTO;

@Mapper
public interface BbsMapper {
    public List<BbsResponseDTO> findAllRow();
    
}