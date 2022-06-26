import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

public class CotrolGGSheets {

	public static void main(String[] args) throws GeneralSecurityException, IOException {
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String spreadsheetId = "1UQQwb0TYRPgtiUIm1tuqyT-Oosnwfj7sOXtxkgvoWKw";
        final String range = "Sheet1!A:B";
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, SheetsQuickstart.JSON_FACTORY, SheetsQuickstart.getCredentials(HTTP_TRANSPORT))
                .setApplicationName(SheetsQuickstart.APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = Arrays.asList(
                Arrays.asList(
                        "hsgdfhkjf"
                )
             // Additional rows ...
        );
        ValueRange body = new ValueRange()
                .setValues(values);
        UpdateValuesResponse result =
                service.spreadsheets().values().update(spreadsheetId, range, body)
                        .setValueInputOption("USER_ENTERED")
                        .execute();
        System.out.printf("%d cells updated.", result.getUpdatedCells());
    }
}
