package com.jingdianjichi.subject.application.convert;

import com.jingdianjichi.subject.application.dto.SubjectLikedDTO;
import com.jingdianjichi.subject.domain.entity.SubjectLikedBO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-30T23:38:00+0800",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.41.0.v20241217-1506, environment: Java 17.0.13 (Eclipse Adoptium)"
)
public class SubjectLikedDTOConverterImpl implements SubjectLikedDTOConverter {

    @Override
    public SubjectLikedBO convertDTOToBO(SubjectLikedDTO subjectLikedDTO) {
        if ( subjectLikedDTO == null ) {
            return null;
        }

        SubjectLikedBO subjectLikedBO = new SubjectLikedBO();

        subjectLikedBO.setPageNo( subjectLikedDTO.getPageNo() );
        subjectLikedBO.setPageSize( subjectLikedDTO.getPageSize() );
        subjectLikedBO.setCreatedBy( subjectLikedDTO.getCreatedBy() );
        subjectLikedBO.setCreatedTime( subjectLikedDTO.getCreatedTime() );
        subjectLikedBO.setId( subjectLikedDTO.getId() );
        subjectLikedBO.setIsDeleted( subjectLikedDTO.getIsDeleted() );
        subjectLikedBO.setLikeUserId( subjectLikedDTO.getLikeUserId() );
        subjectLikedBO.setStatus( subjectLikedDTO.getStatus() );
        subjectLikedBO.setSubjectId( subjectLikedDTO.getSubjectId() );
        subjectLikedBO.setSubjectName( subjectLikedDTO.getSubjectName() );
        subjectLikedBO.setUpdateBy( subjectLikedDTO.getUpdateBy() );
        subjectLikedBO.setUpdateTime( subjectLikedDTO.getUpdateTime() );

        return subjectLikedBO;
    }
}
