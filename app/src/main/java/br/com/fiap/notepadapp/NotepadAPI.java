package br.com.fiap.notepadapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface NotepadAPI {

    @GET(value = "/nota/titulo/{titulo}")
    Call<Nota> buscar(@Path(value = "titulo") String titulo);

    @POST(value = "/nota")
    Call<Void> salvar(@Body Nota nota);

}
