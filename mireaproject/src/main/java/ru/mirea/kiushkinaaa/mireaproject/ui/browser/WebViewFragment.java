package ru.mirea.kiushkinaaa.mireaproject.ui.browser;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.mirea.kiushkinaaa.mireaproject.R;
import ru.mirea.kiushkinaaa.mireaproject.databinding.FragmentBrowserBinding;
import ru.mirea.kiushkinaaa.mireaproject.databinding.FragmentHomeBinding;
import ru.mirea.kiushkinaaa.mireaproject.ui.home.HomeViewModel;


public class WebViewFragment extends Fragment {

    private FragmentBrowserBinding binding;
    public WebView webView;

  /*  @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         webView = webView.findViewById(R.id.wb);
        webView.loadUrl("https://www.google.com/");

    }*/

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_browser, container, false);
        webView = (WebView)v.findViewById(R.id.wb);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/");

        binding = FragmentBrowserBinding.inflate(inflater, container, false);
        return v;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}