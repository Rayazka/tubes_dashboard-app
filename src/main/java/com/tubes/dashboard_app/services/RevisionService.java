package com.tubes.dashboard_app.services;

import com.tubes.dashboard_app.models.Revision;
import java.util.List;

public interface RevisionService{
        Revision createRevision(Revision revision, String revisionId);
        Revision getRevisionById(String id);
        List<Revision> getAllRevision();
        List<Revision> getRevisionsByProjectId(String revisionId);
        Revision updateRevision(String revisionId, Revision revisionDetails); 
        Revision updateStatusRevision(String id, Revision RevisionDetails);
        void deleteRevision(String id);
}