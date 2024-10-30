package xyz.codenestsolucoes.screenmatch.service;

public interface Generic {
    <T> T getData(String json, Class<T> tclass);
}
