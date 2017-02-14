package com.github.mobile.core.commit;

import org.eclipse.egit.github.core.Commit;
import org.eclipse.egit.github.core.CommitFile;
import org.eclipse.egit.github.core.CommitStats;
import org.eclipse.egit.github.core.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by apple on 2/13/17.
 */

public class RepositoryCommit implements Serializable {
    private static final long serialVersionUID = -8911733018395257250L;
    private Commit commit;
    private CommitStats stats;
    private List<Commit> parents;
    private List<CommitFile> files;
    private String sha;
    private String url;
    private User author;
    private User committer;

    public RepositoryCommit(CommitBuilder builder){
        this.commit = builder.commit;
        this.stats = builder.stats;
        this.parents = builder.parents;
        this.files = builder.files;
        this.sha = builder.sha;
        this.url = builder.url;
        this.author = builder.author;
        this.committer = builder.committer;
    }

    public Commit getCommit(){
        return this.commit;
    }

    public CommitStats getStats(){
        return this.stats;
    }

    public List<Commit> getParents(){
        return this.parents;
    }

    public List<CommitFile> getFiles(){
        return this.files;
    }

    public String getSha(){
        return this.sha;
    }

    public String getUrl(){
        return this.url;
    }

    public User getAuthor(){
        return this.author;
    }

    public User getCommitter(){
        return this.committer;
    }

    public static class CommitBuilder{
        private Commit commit;
        private CommitStats stats;
        private List<Commit> parents;
        private List<CommitFile> files;
        private String sha;
        private String url;
        private User author;
        private User committer;

        public CommitBuilder commit(Commit commit){
            this.commit = commit;
            return this;
        }

        public CommitBuilder stats(CommitStats stats){
            this.stats = stats;
            return this;
        }

        public CommitBuilder parents(List<Commit> parents){
            this.parents = parents;
            return this;
        }

        public CommitBuilder files(List<CommitFile> files) {
            this.files = files;
            return this;
        }

        public CommitBuilder sha(String sha){
            this.sha = sha;
            return this;
        }

        public CommitBuilder url(String url) {
            this.url =  url;
            return this;
        }

        public CommitBuilder author(User author){
            this.author = author;
            return this;
        }

        public CommitBuilder committer(User committer) {
            this.committer = committer;
            return this;
        }

    }
}
