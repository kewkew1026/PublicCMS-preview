package com.publiccms.entities.cms;
// Generated 2016-11-20 14:46:17 by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * CmsDictionaryData generated by hbm2java
 */
@Entity
@Table(name = "cms_dictionary_data")
public class CmsDictionaryData implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private CmsDictionaryDataId id;
    @GeneratorColumn(title = "文字")
    private String text;

    public CmsDictionaryData() {
    }

    public CmsDictionaryData(CmsDictionaryDataId id, String text) {
        this.id = id;
        this.text = text;
    }

    @EmbeddedId

    @AttributeOverrides({ @AttributeOverride(name = "dictionaryId", column = @Column(name = "dictionary_id", nullable = false)),
            @AttributeOverride(name = "value", column = @Column(name = "value", nullable = false, length = 50)) })
    public CmsDictionaryDataId getId() {
        return this.id;
    }

    public void setId(CmsDictionaryDataId id) {
        this.id = id;
    }

    @Column(name = "text", nullable = false, length = 100)
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
