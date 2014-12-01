package fr.sii.sonar.quality.core.provider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.fasterxml.jackson.core.type.TypeReference;

import fr.sii.sonar.quality.core.domain.report.QualityReport;
import fr.sii.sonar.report.core.provider.JsonFileReportProvider;

/**
 * Provider that parses a JSON file and generate a {@link QualityReport} instance
 * 
 * @author Aurélien Baudet
 */
public class JsonQualityReportProvider extends JsonFileReportProvider<QualityReport> {

	public JsonQualityReportProvider(File file) throws FileNotFoundException {
		super(file, new TypeReference<QualityReport>() {});
	}

	public JsonQualityReportProvider(InputStream stream) {
		super(stream, new TypeReference<QualityReport>() {});
	}
	
	
}